with open('latex.log', 'r', encoding='utf-8') as f:
    rows_set = set(f.readlines())
    print('¹²{}¹Ø¼üÐÐ'.format(len(rows_set)))